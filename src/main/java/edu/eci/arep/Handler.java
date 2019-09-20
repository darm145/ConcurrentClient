/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arep;

import java.net.URL;
import java.util.ArrayList;

/**
 *
 * @author 2139997
 */
public class Handler {

    public static void main(String[] args) throws Exception {
        URL url = new URL(args[0]);
        System.out.println(args[0]);
        ArrayList<ClientThreads> t = new ArrayList<ClientThreads>();
        for (int i = 0; i < 100; i++) {
            ClientThreads temp = new ClientThreads(url);
            t.add(temp);
            temp.start();
        }

    }

}
