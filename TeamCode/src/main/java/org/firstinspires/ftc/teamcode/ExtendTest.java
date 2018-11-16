package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;
import org.firstinspires.ftc.robotcore.external.Telemetry;

/**
 * Created by sak5222 on 11/16/18.
 */
@TeleOp
public class ExtendTest extends OpMode {

    ErnieHardware robot = new ErnieHardware();

    public void init(){
        robot.init(hardwareMap);
    }

    public void init_loop() {

    }
    public void start(){

    }
    public void loop(){
        float extendo = gamepad1.left_stick_y

        //robot.extend.setPower(extendo);
    }
}
