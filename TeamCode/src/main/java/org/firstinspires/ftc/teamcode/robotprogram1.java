package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

import java.security.PrivateKey;

/**
 * Created by melinda on 9/7/2017.
 */
@TeleOp(name = "robotcode" , group = "robotcode")
public class robotprogram1 extends LinearOpMode
{
    private DcMotor Motor1;
    private DcMotor Motor2;
    private DcMotor Motor3;
    private DcMotor Motor4;
    private DcMotor Motor5;
   private Servo Servo1;
    //private Servo Servo2;
    //private Servo Servo3;


    @Override
    public void runOpMode () throws InterruptedException {
        Motor1 = hardwareMap.dcMotor.get("Motor1");
        Motor2 = hardwareMap.dcMotor.get("Motor2");
        Motor3 = hardwareMap.dcMotor.get("Motor3");
        Motor4 = hardwareMap.dcMotor.get("Motor4");
        Motor5 = hardwareMap.dcMotor.get("Motor5");
        Servo1 =hardwareMap .servo.get("Servo1");
        //Servo2 =hardwareMap .servo.get("Servo2");
        // Servo3 =hardwareMap .servo.get("Servo3");

        Motor2.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        while (opModeIsActive()) {
            Motor1.setPower(-gamepad1.left_stick_y);
            Motor2.setPower(-gamepad1.right_stick_y);

            if (gamepad1.dpad_left)
                Motor3.setPower(-.35);
            else Motor3.setPower(0);
            if (gamepad1.dpad_right) Motor3.setPower(.35);
            else Motor3.setPower(0);

            if (gamepad1.a)
                Motor4.setPower(-.5);
            else Motor4.setPower(0);
            if (gamepad1.y) Motor4.setPower(.5);
            else Motor4.setPower(0);

            Motor5.setPower(gamepad1.right_trigger);
            Motor5.setPower(-gamepad1.left_trigger);

            if(gamepad1.x)
            for (double i = 0.0; i < 1.0; i += .1) {
                Servo1.setPosition(i);
            }
        }

        if(gamepad1.b){
            for(double i = 1.0; i > 0.0; i-= .1) {
                Servo1.setPosition(i);
        }

            idle();

        }
    }
}
