package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class UserService {

    public final UserRepository userRepository;

    @Transactional
    public Integer save(User User) {
        return userRepository.save(User).getUserID();
    }

    public User findById(int id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 유저입니다."));
    }

    @Transactional
    public void delete(int id) {
        User user = findById(id);
        userRepository.delete(user);
    }

    @Transactional
    public int update(int id, User user){
        User currentUser = findById(id);
        currentUser.update(user.getNickname(), user.getProfileimgURL());
        return id;
    }

    public int put(int id, User user) {
        User currentUser = findById(id);
        return id;
    }
}