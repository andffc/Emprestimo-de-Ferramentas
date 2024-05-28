CREATE DATABASE IF NOT EXISTS `database`;

USE `database`;

DROP TABLE IF EXISTS `tb_ferramentas`;

DROP TABLE IF EXISTS `tb_emprestimos`;

DROP TABLE IF EXISTS `tb_amigos`;

CREATE TABLE IF NOT EXISTS `tb_amigos` (
  `id_amigo` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `telefone` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_amigo`)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `tb_emprestimos` (
  `id_emprestimo` INT NOT NULL AUTO_INCREMENT,
  `data_emprestimo` DATE NOT NULL,
  `data_devolucao` DATE NOT NULL,
  `entregue` BOOLEAN NOT NULL,
  `id_amigo` INT NOT NULL,
  PRIMARY KEY (`id_emprestimo`),
  INDEX `fk_tb_emprestimos_tb_amigos_idx` (`id_amigo` ASC) VISIBLE,
  CONSTRAINT `fk_tb_emprestimos_tb_amigos`
    FOREIGN KEY (`id_amigo`)
    REFERENCES `tb_amigos` (`id_amigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `tb_ferramentas` (
  `id_ferramenta` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `marca` VARCHAR(45) NOT NULL,
  `custo_aquisicao` DOUBLE NOT NULL,
  `id_emprestimo` INT,
  PRIMARY KEY (`id_ferramenta`),
  INDEX `fk_tb_ferramentas_tb_emprestimos1_idx` (`id_emprestimo` ASC) VISIBLE,
  CONSTRAINT `fk_tb_ferramentas_tb_emprestimos1`
    FOREIGN KEY (`id_emprestimo`)
    REFERENCES `tb_emprestimos` (`id_emprestimo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE = InnoDB;
