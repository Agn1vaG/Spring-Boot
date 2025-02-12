package udemy.Lproject.learn_spring_framework.example.a2;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService{

    //DataService is a dependencies
    private DataService dataService;

    public BusinessCalculationService(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.retriveData())
                .max().orElse(0);
    }
}

