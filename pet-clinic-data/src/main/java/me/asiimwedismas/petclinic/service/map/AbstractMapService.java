package me.asiimwedismas.petclinic.service.map;

import me.asiimwedismas.petclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null){
            if (object.getId()==  null){
                object.setId(nextID());
            }
        map.put(object.getId(), object);
        }
        return object;
    }

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.equals(object));
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    private Long nextID(){
        Set<Long> longs = map.keySet();
        if (longs.isEmpty()){
            return 1L;
        }

        return Collections.max(longs) + 1;
    }
}
