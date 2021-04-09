package com.test;

import com.mfy.limiter.annotation.Limiter;
import com.mfy.limiter.filter.RateLimiter;

import java.util.List;

@Limiter(limiterName = "tokenBucketRateLimiter", urlPatterns = "/*", luaName = "token_bucket_rate_limiter.lua")
public class TokenBucketRateLimiter extends RateLimiter {

    @Override
    public List<String> getKeys(List<String> keys) {
        keys.add(String.valueOf(System.currentTimeMillis() / 1000));
        return keys;
    }
}
