package com.kefala.app.Entities;

import com.kefala.app.Models.DTO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kefala on 19/06/16.
 */
public abstract class DAO<MODEL_DTO extends DTO> implements DAOInterface<MODEL_DTO> {

    public void create(MODEL_DTO model) {
        List<MODEL_DTO> currents = readContent();
        currents.add(model);
        writeList(currents);
    }

    public void delete(MODEL_DTO model) {
        List<MODEL_DTO> currents = readContent();
        int index = findIndex(model.getId());
        if(index >= 0){
            currents.remove(index);
        }
        writeList(currents);
    }

    public List<MODEL_DTO> getAll() {
        return readContent();
    }

    public MODEL_DTO find(Serializable key) {
        List<MODEL_DTO> currents = readContent();
        MODEL_DTO model = null;
        for(MODEL_DTO obj: currents){
            if(obj.getId().equals(key)){
                model =obj;
            }
        }
        return model;
    }

    public void update(MODEL_DTO model) {
        List<MODEL_DTO> currents = readContent();
        int index = findIndex(model.getId());
        if(index >=0){
            currents.remove(index);
            currents.add(model);
        }
        writeList(currents);
    }

    public File getFile() throws IOException {
        File archivo = new File(DIRECTORY_PATH+getFileName());
        if(!archivo.exists()) {
            new FileWriter(archivo);
        }
        return archivo;
    }

    public abstract String getFileName();

    protected List<MODEL_DTO> readContent(){
        List<MODEL_DTO> listado = new ArrayList<MODEL_DTO>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(getFile()));
            listado = (ArrayList<MODEL_DTO>)ois.readObject();
            ois.close();
        } catch (EOFException e){
            //e.printStackTrace();
        } catch (IOException ioe){
            ioe.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        return listado;

    }

    protected void writeList(List<MODEL_DTO> list) {
        try {
            ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(getFile()));
            oos.writeObject(list);
            oos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected int findIndex(Serializable key) {
        List<MODEL_DTO> currents = readContent();
        int index = -1, i =0;
        for(MODEL_DTO obj: currents){
            if(obj.getId().equals(key)){
                index =i;
            }
            i++;
        }
        return index;
    }

    public void deleteAll() {
        writeList(new ArrayList<MODEL_DTO>());
    }
}
