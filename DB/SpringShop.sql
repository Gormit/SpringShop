-- --------------------------------------------------------
-- Хост:                         127.0.0.1
-- Версия сервера:               5.6.21 - MySQL Community Server (GPL)
-- ОС Сервера:                   Win32
-- HeidiSQL Версия:              9.2.0.4947
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
-- Дамп данных таблицы shop.t_category: ~3 rows (приблизительно)
/*!40000 ALTER TABLE `t_category` DISABLE KEYS */;
INSERT INTO `t_category` (`F_categoryId`, `F_categoryName`) VALUES
	(1, 'Car'),
	(2, 'Tank'),
	(3, 'Helicopter');
/*!40000 ALTER TABLE `t_category` ENABLE KEYS */;

-- Дамп данных таблицы shop.t_good: ~3 rows (приблизительно)
/*!40000 ALTER TABLE `t_good` DISABLE KEYS */;
INSERT INTO `t_good` (`F_goodId`, `F_count`, `F_description`, `F_name`, `F_price`, `F_categoryId`, `F_manufacturerId`) VALUES
	(1, 5, 'description', 'Supercar', 30000, 1, 3),
	(2, 3, 'Описание', 'M4 Sherman', 40000, 2, 1),
	(3, 0, '1331231231', 'Вертолет', 50000, 3, 2),
	(4, 2, 'hel', 'Heli', 25000, 3, 1);
/*!40000 ALTER TABLE `t_good` ENABLE KEYS */;

-- Дамп данных таблицы shop.t_manufacturer: ~3 rows (приблизительно)
/*!40000 ALTER TABLE `t_manufacturer` DISABLE KEYS */;
INSERT INTO `t_manufacturer` (`F_manufacturerId`, `F_manufacturerName`) VALUES
	(1, 'OSP'),
	(2, 'RoboteX'),
	(3, 'Hasbro');
/*!40000 ALTER TABLE `t_manufacturer` ENABLE KEYS */;

-- Дамп данных таблицы shop.t_role: ~3 rows (приблизительно)
/*!40000 ALTER TABLE `t_role` DISABLE KEYS */;
INSERT INTO `t_role` (`F_roleId`, `F_name`) VALUES
	(1, 'admin'),
	(2, 'user'),
	(3, 'ban');
/*!40000 ALTER TABLE `t_role` ENABLE KEYS */;

-- Дамп данных таблицы shop.t_user: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` (`F_userId`, `F_mail`, `F_password`, `F_roleId`) VALUES
	(1, '1', '1', 1),
	(2, '2', '2', 2),
	(3, '3', '3', 3);
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;

-- Дамп данных таблицы shop.t_userdetail: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `t_userdetail` DISABLE KEYS */;
INSERT INTO `t_userdetail` (`F_userDetailId`, `F_city`, `F_firstname`, `F_lastname`, `F_phone`, `F_street`, `F_userId`) VALUES
	(1, 'Minsk', 'Alex', 'Ben', '1458711', 'Jukova', 1),
	(2, 'Minsk', 'All', 'Bee', '3136337', 'Bobruskaya', 2),
	(3, 'Minsk', 'Cheater', 'Haker', '127001', '...', 3);
/*!40000 ALTER TABLE `t_userdetail` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
