package com.github.afym.restapi;

import com.github.afym.restapi.parse.ResultContainer;
import com.github.afym.restapi.parse.ResultMessage;
import com.google.gson.Gson;

public class ResponseConversion {
    private ResultContainer resultContainer;

    public ResponseConversion(String jsonResponse){
        Gson gson = new Gson();
        this.resultContainer = gson.fromJson(jsonResponse, ResultContainer.class);
        this.validateParser();
    }

    public ResultContainer getResultContainer(){
        return this.resultContainer;
    }

    private void validateParser() {
        if (this.resultContainer == null) {
            this.resultContainer = new ResultContainer();
            this.resultContainer.Response = new ResultMessage();
            this.resultContainer.Response.Status = false;
        }
    }
}