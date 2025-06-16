package com.example.springaop.bussines;

import com.example.springaop.aspect.traketime;
import com.example.springaop.data.Data1;
import com.example.springaop.data.Data2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Bussines2 {
    private Data2 data2;
    @Autowired
    public Bussines2(Data2 data2) {
        this.data2 = data2;
    }

    @traketime   /// This annotation can be used to track the execution time of this method.
    public String getData() {
        return data2.retrieveData();
    }
    public String getDataWithException() {
        throw new RuntimeException("Exception in Business2");
    }
}
