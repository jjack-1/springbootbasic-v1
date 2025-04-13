package com.example.loginapp.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public void 회원가입(UserRequest.JoinDTO reqDTO) {
        User alreadyUser = userRepository.findByUsername(reqDTO.getUsername());

        if (alreadyUser != null) {
            throw new RuntimeException("이미 사용중인 username 입니다");
        }

        userRepository.save(reqDTO.toEntity());
    }

    public User 로그인(UserRequest.LoginDTO reqDTO) {
        User user = userRepository.findByUsername(reqDTO.getUsername());

        if (user == null || !(reqDTO.getPassword().equals(user.getPassword()))) {
            throw new RuntimeException("username 혹은 password가 틀렸습니다");
        }

        return user;
    }
}
