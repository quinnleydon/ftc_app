package org.firstinspires.ftc.robotcontroller;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp (name = "TeleOp Tutorial",group = "Tutorials")
/**
 * Created by melinda on 7/26/2017.
 */

public class TeleOpTutorial extends LinearOpMode
{
    private DcMotor leftMotor;
    private DcMotor rightMotor;
    private DcMotor Motor1;
    private DcMotor Motor2;
    private DcMotor Motor3;
    private DcMotor Motor4;




    @Override
    public void runOpMode()throws InterruptedException
    {

        leftMotor = hardwareMap.dcMotor.get("leftMotor");
        rightMotor = hardwareMap.dcMotor.get("rightMotor");
        Motor1 = hardwareMap.dcMotor.get("Motor1");
        Motor2 = hardwareMap.dcMotor.get("Motor2");

        rightMotor.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();


        while (opModeIsActive())
        {
            leftMotor.setPower(gamepad1.left_stick_y);
            rightMotor.setPower(gamepad1.right_stick_y);

            if (gamepad1.right_bumper)
                Motor1.setPower(1);
            else if (gamepad1.left_bumper)
                Motor1.setPower(-1);
            else if (gamepad1.b)
                Motor1.setPower(0);

            if (gamepad1.x)
                Motor2.setPower(1);
            else if (gamepad1.a)
                Motor2.setPower(0);

            if (gamepad1.y)
                Motor3.setPower(1);
            else if (gamepad1.a)
                Motor3.setPower(0);


            idle();
        }
    }
}

