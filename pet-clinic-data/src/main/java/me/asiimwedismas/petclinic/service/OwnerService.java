package me.asiimwedismas.petclinic.service;

import me.asiimwedismas.petclinic.model.Owner;

public interface OwnerService extends BaseCrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
