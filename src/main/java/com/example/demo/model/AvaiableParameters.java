package com.example.demo.model;

import com.example.demo.allegro.ParameterInfoType;

import java.util.ArrayList;
import java.util.List;

public class AvaiableParameters {

    private static List<ParameterInfoType> parameterList;
    private static List<Parameter> simpleList;

    public static void setParameterList(List<ParameterInfoType> parameterList) {
        simpleList = new ArrayList<>();
        AvaiableParameters.parameterList = parameterList;
        int i = 0;
        for (ParameterInfoType item : AvaiableParameters.parameterList) {
            simpleList.add(new Parameter(i, item.getParameterName()));
            i++;
        }
    }

    public static List<Parameter> getParameterList() {
        return simpleList;
    }
}
