/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.util.EventListener;

/**
 *
 * @author Tinip
 */
public interface ScoreListener extends EventListener{
        public void scoreChange(ScoreEvent e);
    
}
