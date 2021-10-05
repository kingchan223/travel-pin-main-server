package com.TravelPinMainServer.service;

import com.TravelPinMainServer.domain.dto.JoinUserDTO;
import com.TravelPinMainServer.domain.entity.User;
import com.TravelPinMainServer.exception.AlreadyJoinedEmailException;
import com.TravelPinMainServer.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class UserService {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final UserRepository userReposiroty;

    @Transactional
    public void joinUser(JoinUserDTO joinUserDto) throws AlreadyJoinedEmailException {
        String encodedPw = bCryptPasswordEncoder.encode(joinUserDto.getPassword());
        User user = User.createUserWithDTO(joinUserDto, encodedPw);
        Long id = userReposiroty.joinUser(user);
    }
}
