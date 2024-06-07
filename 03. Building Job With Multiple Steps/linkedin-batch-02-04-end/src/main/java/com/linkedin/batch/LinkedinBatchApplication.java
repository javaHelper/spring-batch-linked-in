package com.linkedin.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableBatchProcessing
public class LinkedinBatchApplication {

	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Bean
	public Step givePackageToCustomerStep() {
		return this.stepBuilderFactory.get("givePackageToCustomer")
				.tasklet((contribution, chunkContext) -> {
					System.out.println("## Given the package to the customer.");
					return RepeatStatus.FINISHED;
				}).build();
	}

	@Bean
	public Step driveToAddressStep() {
		return this.stepBuilderFactory.get("driveToAddressStep")
				.tasklet((contribution, chunkContext) -> {
					System.out.println("## Successfully arrived at the address.");
					return RepeatStatus.FINISHED;
				}).build();
	}

	@Bean
	public Step packageItemStep() {
		return this.stepBuilderFactory.get("packageItemStep").tasklet((contribution, chunkContext) -> {
			String item = chunkContext.getStepContext().getJobParameters().get("item").toString();
			String date = chunkContext.getStepContext().getJobParameters().get("run.date").toString();

			System.out.printf("## The %s has been packaged on %s.%n", item, date);
			return RepeatStatus.FINISHED;
		}).build();
	}

	@Bean
	public Job deliverPackageJob() {
		return this.jobBuilderFactory.get("deliverPackageJob")
				.start(packageItemStep())
				.next(driveToAddressStep())
				.next(givePackageToCustomerStep())
				.build();
	}



	public static void main(String[] args) {
		SpringApplication.run(LinkedinBatchApplication.class, "item=Bag","run.date(date)=2021/12/12");
	}

}