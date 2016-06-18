package com.kefala.app.Entities;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by kefala on 17/06/16.
 */
public class Entity implements Serializable {
    private String fileName;
    private ArrayList<Object> objects;

    public Entity(String fileName) {
        this.fileName = fileName;
        this.objects = new ArrayList<Object>();
    }

    public String getFileName() {
        return fileName;
    }

    public ArrayList add(Object object) {

        try {
            File entityFile = new File("/home/kefala/Documentos/java/files/" + fileName);

            if(!entityFile.exists()) {
                FileOutputStream fou = new FileOutputStream("/home/kefala/Documentos/java/files/" + fileName);
                ObjectOutputStream oos = new ObjectOutputStream(fou);
                oos.writeObject(objects);
                oos.close();
            }

            FileInputStream fis = new FileInputStream("/home/kefala/Documentos/java/files/" + fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            if (ois.readObject() != null) {
                objects = (ArrayList<Object>) ois.readObject();
            }
            objects.add(object);

            FileOutputStream fo = new FileOutputStream("/home/kefala/Documentos/java/files/" + fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(objects);

            oos.close();
        } catch (EOFException e) {
            //e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return objects;
    }

    public ArrayList getAll() {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("/home/kefala/Documentos/java/files/" + fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            if (ois.readObject() != null) {
                objects = (ArrayList<Object>) ois.readObject();
            }
        } catch (EOFException e) {
            //e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return objects;
    }
}
