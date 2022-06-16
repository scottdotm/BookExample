/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuckGame;

/**
 *
 * @author scott
 */
public class TealDuck extends Duck {
    public TealDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyRocketPowered();
    }
    
    @Override
    public void display(){
        System.out.println("I'm a real Teal Duck");
    }
}
