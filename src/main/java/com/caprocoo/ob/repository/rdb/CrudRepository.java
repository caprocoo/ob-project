package com.caprocoo.ob.repository.rdb;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * packageName    : com.caprocoo.ob.repository
 * fileName       : CurdRepository
 * author         : caprocoo
 * date           : 2022-12-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-24        caprocoo       최초 생성
 */
@NoRepositoryBean
public interface CrudRepository<T, ID> extends PagingAndSortingRepository<T, ID>, JpaRepository<T,ID> {
    List<T> findAll(Specification<Object> specification);

    List<T> findAll(Specification<Object> specification, Sort sort);

    Page<T> findAll(Specification<Object> specification, Pageable pageable);
}
