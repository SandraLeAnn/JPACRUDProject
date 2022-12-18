-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema flyfishingdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `flyfishingdb` ;

-- -----------------------------------------------------
-- Schema flyfishingdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `flyfishingdb` DEFAULT CHARACTER SET utf8 ;
USE `flyfishingdb` ;

-- -----------------------------------------------------
-- Table `spot`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `spot` ;

CREATE TABLE IF NOT EXISTS `spot` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `description` VARCHAR(2000) NULL,
  `water_type` VARCHAR(45) NULL,
  `location` VARCHAR(45) NULL,
  `fish` VARCHAR(45) NULL,
  `img_url` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS admin@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'admin'@'localhost' IDENTIFIED BY 'admin';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'admin'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `spot`
-- -----------------------------------------------------
START TRANSACTION;
USE `flyfishingdb`;
INSERT INTO `spot` (`id`, `name`, `description`, `water_type`, `location`, `fish`, `img_url`) VALUES (1, 'Colorado River', 'Colorados river', 'river', 'colorado', 'brown', NULL);
INSERT INTO `spot` (`id`, `name`, `description`, `water_type`, `location`, `fish`, `img_url`) VALUES (2, 'Green River', 'this is green', 'river', 'rock springs', 'rainbow', NULL);
INSERT INTO `spot` (`id`, `name`, `description`, `water_type`, `location`, `fish`, `img_url`) VALUES (3, 'Snake River', 'snakes!', 'river', 'idaho', 'rainbow', NULL);
INSERT INTO `spot` (`id`, `name`, `description`, `water_type`, `location`, `fish`, `img_url`) VALUES (4, 'Powder River', 'powdery', 'river', 'buffalo', 'trout', NULL);

COMMIT;

