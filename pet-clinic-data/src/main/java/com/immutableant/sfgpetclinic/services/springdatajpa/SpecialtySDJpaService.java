package com.immutableant.sfgpetclinic.services.springdatajpa;

import com.immutableant.sfgpetclinic.model.Specialty;
import com.immutableant.sfgpetclinic.repositories.SpecialtyRepository;
import com.immutableant.sfgpetclinic.services.SpecialtiesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialtySDJpaService implements SpecialtiesService {

  private final SpecialtyRepository specialtyRepository;

  public SpecialtySDJpaService(SpecialtyRepository specialtyRepository) {
    this.specialtyRepository = specialtyRepository;
  }

  @Override
  public Set<Specialty> findAll() {
    Set<Specialty> specialties = new HashSet<>();
    specialtyRepository.findAll().forEach(specialties::add);
    return specialties;
  }

  @Override
  public Specialty findById(Long aLong) {
    return specialtyRepository.findById(aLong).orElse(null);
  }

  @Override
  public Specialty save(Specialty object) {
    return specialtyRepository.save(object);
  }

  @Override
  public void delete(Specialty object) {
    specialtyRepository.delete(object);
  }

  @Override
  public void deleteById(Long aLong) {
    specialtyRepository.deleteById(aLong);
  }
}
