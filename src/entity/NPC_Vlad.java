package entity;

import main.GamePanel;

import java.util.Random;

public class NPC_Vlad extends Entity {

    public NPC_Vlad(GamePanel gp) {
        super(gp);

        direction = "down";
        speed = 1;

        getImage();
    }
    public void getImage() {

        up1 = setup("/npc/vlad_left_1");
        up2 = setup("/npc/vlad_left_2");
        down1 = setup("/npc/vlad_right_1");
        down2 = setup("/npc/vlad_right_2");
        left1 = setup("/npc/vlad_left_1");
        left2 = setup("/npc/vlad_left_2");
        right1 = setup("/npc/vlad_right_1");
        right2 = setup("/npc/vlad_right_2");
    }

    public void setAction() {

        actionLockCounter++;

        if(actionLockCounter == 120){
            Random random = new Random();
            int i = random.nextInt(100) + 1; // pick up a number from 1 to 100

            if(i <= 25) {
                direction = "up";
            }
            if(i > 25 && i <= 50) {
                direction = "down";
            }
            if(i > 50 && i <= 75) {
                direction = "left";
            }
            if(i > 75) {
                direction = "right";
            }

            actionLockCounter = 0;
        }


    }
}
