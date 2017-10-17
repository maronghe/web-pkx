-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               5.5.5-10.0.11-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             8.0.0.4396
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
-- Dumping data for table intelligent_bucket.datas: ~0 rows (approximately)
DELETE FROM `datas`;
/*!40000 ALTER TABLE `datas` DISABLE KEYS */;
INSERT INTO `datas` (`id`, `temp`, `hum`) VALUES
	(1, 'a1234', 'm1234'),
	(2, '123', 'qwe');
/*!40000 ALTER TABLE `datas` ENABLE KEYS */;

-- Dumping data for table intelligent_bucket.datas_yali: ~0 rows (approximately)
DELETE FROM `datas_yali`;
/*!40000 ALTER TABLE `datas_yali` DISABLE KEYS */;
INSERT INTO `datas_yali` (`id`, `yali`) VALUES
	(1, '20');
/*!40000 ALTER TABLE `datas_yali` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
