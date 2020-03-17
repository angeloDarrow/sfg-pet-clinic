package com.angelo.sfgpetclinic.services;

import com.angelo.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
