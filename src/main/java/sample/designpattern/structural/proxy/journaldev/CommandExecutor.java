/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.designpattern.structural.proxy.journaldev;

/**
 *
 * @author kumar saurabh
 */
public interface CommandExecutor {

    public void runCommand(String cmd) throws Exception;
}
