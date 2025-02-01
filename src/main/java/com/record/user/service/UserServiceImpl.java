package com.record.user.service;

import com.record.user.mapper.UserMapper;
import com.record.user.model.User;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service  // Spring의 Service 컴포넌트로 등록
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.findAll();
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return Optional.ofNullable(userMapper.findById(id));  // Null 체크
    }

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.update(user);
    }

    @Override
    public void deleteUser(Long id) {
        userMapper.delete(id);
    }
}
