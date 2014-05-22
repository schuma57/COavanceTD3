package designpattern;

import modele.CPU;
import modele.HardDrive;
import modele.Memory;

/**
 * Created by schuma on 22/05/14.
 */
public class ComputerFacade {
    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    final int BOOT_ADDRESS = 00123;
    final int BOOT_SECTOR = 12345;
    final int SECTOR_SIZE = 3000;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
