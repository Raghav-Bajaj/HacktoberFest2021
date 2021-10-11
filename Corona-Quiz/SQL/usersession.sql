-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: sql311.byetcluster.com
-- Generation Time: Oct 07, 2021 at 12:16 PM
-- Server version: 5.7.35-38
-- PHP Version: 7.2.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `epiz_26548248_subs`
--

-- --------------------------------------------------------

--
-- Table structure for table `usersession`
--

CREATE TABLE `usersession` (
  `uid` int(250) NOT NULL,
  `username` varchar(250) DEFAULT NULL,
  `totalques` int(250) DEFAULT NULL,
  `answerscorrect` int(250) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `usersession`
--

INSERT INTO `usersession` (`uid`, `username`, `totalques`, `answerscorrect`) VALUES
(1, 'Rahul Kalyankar', NULL, NULL),
(2, 'Rahul Kalyankar', NULL, NULL),
(3, 'Rahul Kalyankar', NULL, NULL),
(4, 'Rahul Kalyankar', NULL, NULL),
(5, 'Rahul Kalyankar', 6, 2),
(6, 'Rahul Kalyankar', 6, 4),
(7, 'kalyankarrahul500@gmail.com', 6, 5),
(8, 'kalyankarrahul500', 6, 2),
(9, 'adityacheke291@gmail.com', 6, 5),
(10, 'Example@example.com', 6, 6),
(11, 'kalyankarrahul500', 6, 4),
(12, 'Rahul Kalyankar', 6, 0),
(13, 'laxmi@gmail.com', 6, 3),
(14, '', 6, 0),
(15, 'kalyankarrahul500@gmail.com', 6, 6);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `usersession`
--
ALTER TABLE `usersession`
  ADD PRIMARY KEY (`uid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `usersession`
--
ALTER TABLE `usersession`
  MODIFY `uid` int(250) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
