package com.freshworks.com.repository;

import com.freshworks.com.domain.Sample1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

public class Sample1Repository {

    private static final String template = "Hello, %s!";

}
