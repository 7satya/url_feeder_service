package com.program.web.URLFeederService.dao;

import com.program.web.URLFeederService.model.URL;
import org.springframework.data.jpa.repository.JpaRepository;

public interface URLRepository extends JpaRepository<URL, String> {
}
