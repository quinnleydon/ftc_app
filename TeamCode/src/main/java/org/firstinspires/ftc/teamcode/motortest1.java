package org.firstinspires.ftc.teamcode;

/**
 * Created by melinda on 9/1/2017.
 */

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp (name = "motor test",group = "test")


public class motortest1 extends LinearOpMode
{
    private DcMotor Motor1;
    private DcMotor Motor2;
    private DcMotor Motor3;
    private DcMotor Motor4;
    private DcMotor Motor5;
    @Override
    public void runOpMode () throws InterruptedException
    {
        Motor1 =hardwareMap .dcMotor.get ("Motor1");
        Motor2 =hardwareMap .dcMotor.get ("Motor2");
        Motor3 =hardwareMap .dcMotor.get ("Motor3");
        Motor4 =hardwareMap .dcMotor.get ("Motor4");
        Motor5 =hardwareMap .dcMotor.get ("Motor5");

        Motor2.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        while(opModeIsActive())
        {
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




            idle();

        }
    }
}
