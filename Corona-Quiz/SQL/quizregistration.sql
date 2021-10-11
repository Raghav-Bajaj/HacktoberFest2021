-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: sql311.byetcluster.com
-- Generation Time: Oct 07, 2021 at 12:14 PM
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
-- Table structure for table `quizregistration`
--

CREATE TABLE `quizregistration` (
  `uid` int(255) NOT NULL,
  `user` varchar(255) NOT NULL,
  `pass` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `quizregistration`
--

INSERT INTO `quizregistration` (`uid`, `user`, `pass`) VALUES
(1, 'Rahul Kalyankar', 'rahul'),
(2, 'kalyankarrahul500@gmail.com', 'rahul1234'),
(3, 'kalyankarrahul500', '1234'),
(4, 'adityacheke291@gmail.com', 'Q3o1'),
(5, 'Example@example.com', '12345'),
(6, 'laxmi@gmail.com', '1234'),
(7, 'kalyankarrahul500@gmail.com', '1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `quizregistration`
--
ALTER TABLE `quizregistration`
  ADD PRIMARY KEY (`uid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `quizregistration`
--
ALTER TABLE `quizregistration`
  MODIFY `uid` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
