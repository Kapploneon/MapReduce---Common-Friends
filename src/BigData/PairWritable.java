package BigData;


import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import org.apache.hadoop.io.Writable;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Mapper.Context;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;

public class PairWritable implements Writable{
   private String first;
   private String second;

   public PairWritable(){}

    @Override
    public void write(DataOutput dataOutput) throws IOException {
       dataOutput.writeBytes(first);
       dataOutput.writeBytes(second);

    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
       first = dataInput.readLine();
       second = dataInput.readLine();
    }

    public String getFirst(){
       return first;
    }

    public String getSecond(){
        return second;
    }

    public void set(String a, String b){
       if(a.compareTo(b)<0){
           this.first =a;
           this.second=b;
       }
       else{
           this.first =b;
           this.second=a;
       }
    }

}
