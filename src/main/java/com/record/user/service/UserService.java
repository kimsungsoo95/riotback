package com.record.user.service;

import com.record.user.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();  // 모든 사용자 조회
    Optional<User> getUserById(Long id);  // 특정 사용자 조회
    void addUser(User user);  // 사용자 추가
    void updateUser(User user);  // 사용자 수정
    void deleteUser(Long id);  // 사용자 삭제
}

