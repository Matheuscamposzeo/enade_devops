/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ces.enade.util;

import com.google.common.hash.Hashing;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author mathe
 */
public class EncryptUtil {

    public static String encrypt(String value) {
        return Hashing.sha256().hashString(value, StandardCharsets.UTF_8).toString();
    }
    
}
