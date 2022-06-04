package nz.ac.auckland.se754.web.service;

import org.springframework.stereotype.Service;

@Service
public class AddService {
    public int add(int num1,int num2){
        return num1+num2;
    }
}
