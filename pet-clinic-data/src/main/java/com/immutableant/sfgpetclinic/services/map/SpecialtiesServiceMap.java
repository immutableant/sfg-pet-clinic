package com.immutableant.sfgpetclinic.services.map;

import com.immutableant.sfgpetclinic.model.Specialty;
import com.immutableant.sfgpetclinic.services.SpecialtiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialtiesServiceMap extends AbstractMapService<Specialty, Long>
    implements SpecialtiesService {
  @Override
  public Set<Specialty> findAll() {
    return super.findAll();
  }

  @Override
  public void delete(Specialty specialty) {
    super.delete(specialty);
  }

  @Override
  public Specialty save(Specialty specialty) {
    return super.save(specialty);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public Specialty findById(Long id) {
    return super.findById(id);
  }
}