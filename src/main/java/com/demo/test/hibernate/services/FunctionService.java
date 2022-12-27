package com.demo.test.hibernate.services;

import com.demo.test.hibernate.functionInterface.IntByStringFunction;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FunctionService {
    public List<String> convertIntListToString(){
        List<Integer> test = Arrays.asList(1,2,3,4,5);
        return convertStringToList(test,String::valueOf);
    }

    private List<String> convertStringToList(List<Integer> list, IntByStringFunction<String, Integer> function){
        return list.stream().map(item->function.convert(item)).collect(Collectors.toList());
    }

}
