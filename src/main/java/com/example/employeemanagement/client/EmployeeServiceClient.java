package com.example.employeemanagement.client;

import com.example.employeemanagement.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.stream.IntStream;

@RequiredArgsConstructor
@Service
public class EmployeeServiceClient {

    private final WebClient.Builder clientBuilder;

    public void test() {
        String url = "http://localhost:8080/employees/";
        IntStream stream = IntStream.range(1, 1000);
        stream.parallel().forEach(id -> {
            Employee block = clientBuilder.build().get().uri(url + id).retrieve().bodyToMono(Employee.class).block();
            System.out.println(block.getId());

        });

    }

    public void post() {
        IntStream stream = IntStream.range(1000, 2000);
        String url = "http://localhost:8080/employees";
        stream.parallel().forEach(id -> {
            Employee employee = new Employee();
            employee.setFirstName("pradeep"+ id);
            employee.setLastName("sundaram"+ id);
            if(id%5==0){
                employee.setEmail("pradeep@gmail.com");
            }
            else
            {
                employee.setEmail("pradeep@gmail.com" + id );
            }
            try {
                Employee block = clientBuilder.build().post().uri(url)
                        .accept(MediaType.APPLICATION_JSON )
                        .body(Mono.just(employee),Employee.class)
                        .retrieve()
                        .bodyToMono(Employee.class).block();
                System.out.println(block.getId());
            }catch (Exception e){
                e.printStackTrace();
            }


        });

    }
}
