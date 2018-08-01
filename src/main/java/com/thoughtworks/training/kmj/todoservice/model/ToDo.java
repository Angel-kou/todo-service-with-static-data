package com.thoughtworks.training.kmj.todoservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDo {


    private int id;

    private String content;




    @JsonProperty("completed")
    public boolean completed(){
        return false;
    }

    @JsonProperty("readOnly")
    public boolean readOnly(){
        return true;
    }


    @JsonIgnore
    @JsonProperty("test")
    public String name(){
        return "haha";
    }
}
