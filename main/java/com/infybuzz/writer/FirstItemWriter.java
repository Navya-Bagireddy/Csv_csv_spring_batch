package com.infybuzz.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import com.infybuzz.model.StudentCsv;

@Component
public class FirstItemWriter implements ItemWriter<StudentCsv> {

	@Override
	public void write(List<? extends StudentCsv> items) throws Exception {
		System.out.println("Inside Item Writer");
		items.stream().forEach(System.out::println);
	}

}

/*
private Resource outputResource = new FileSystemResource("output/outputData.csv");

@Bean
public FlatFileItemWriter<Employee> writer() 
{
  //Create writer instance
  FlatFileItemWriter<Employee> writer = new FlatFileItemWriter<>();
   
  //Set output file location
  writer.setResource(outputResource);
   
  //All job repetitions should "append" to same output file
  writer.setAppendAllowed(true);
   
  //Name field values sequence based on object properties 
  writer.setLineAggregator(new DelimitedLineAggregator<Employee>() {
    {
      setDelimiter(",");
      setFieldExtractor(new BeanWrapperFieldExtractor<Employee>() {
        {
          setNames(new String[] { "id", "firstName", "lastName" });
        }
      });
    }
  });
  return writer;
} */