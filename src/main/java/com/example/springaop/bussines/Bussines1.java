package com.example.springaop.bussines;

import com.example.springaop.aspect.Logging;
import com.example.springaop.aspect.traketime;
import com.example.springaop.data.Data1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Bussines1 {

    private Data1 data1;
    @Autowired
    public Bussines1(Data1 data1) {
        this.data1 = data1;
    }
    /// This annotation can be used to track the execution time of this method.
    @traketime

    @Logging  // This annotation can be used to log the method execution.
    public String getData() {
        return data1.retrieveData();
    }
//    public String getDataWithException() {
//        throw new RuntimeException("Exception in Bussines1");
//    }
}
