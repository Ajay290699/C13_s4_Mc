package com.niit.C13_s4_Mc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.CONFLICT,reason = "Track already exists")
public class TrackAlreadyExistException extends Exception{
}
