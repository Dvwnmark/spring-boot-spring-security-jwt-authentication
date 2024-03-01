package com.bkz.jwt.service;

import com.bkz.jwt.entity.Token;

public interface TokenService {
    Token createToken (Token token);
    Token findByToken (String token);
}
