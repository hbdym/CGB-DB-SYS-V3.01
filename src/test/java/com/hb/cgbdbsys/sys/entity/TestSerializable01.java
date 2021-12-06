package com.hb.cgbdbsys.sys.entity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.Date;

@SpringBootTest
public class TestSerializable01 {


    @Test
    public  void testSerialize() throws IOException {
        SysLog log = new SysLog();
        log.setId(100);
        log.setIp("192.168.1.111");
        log.setUsername("administrator");
        log.setOperation("Update");
        log.setMethod("com.deleteObject");
        log.setParams("String(1)");
        log.setTime(10L);
        log.setCreatedTime(new Date());

        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(
                    new FileOutputStream("testSerialize.txt")
                );

        objectOutputStream.writeObject(log);
        objectOutputStream.close();
        System.out.println("序列化OK");

    }

    @Test
    public void testDeserialize() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(
                        new File("testSerialize.txt")));


        Object object = in.readObject();
        System.out.println(object);
        in.close();
    }



}
