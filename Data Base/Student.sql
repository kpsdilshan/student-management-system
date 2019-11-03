-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 18, 2017 at 05:49 AM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `Student`
--

-- --------------------------------------------------------

--
-- Table structure for table `degreeprograms`
--

CREATE TABLE IF NOT EXISTS `degreeprograms` (
  `degreeid` int(20) NOT NULL AUTO_INCREMENT,
  `degreename` varchar(100) NOT NULL,
  `duration` int(10) NOT NULL,
  `description` varchar(300) NOT NULL,
  PRIMARY KEY (`degreeid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `degreeprograms`
--

INSERT INTO `degreeprograms` (`degreeid`, `degreename`, `duration`, `description`) VALUES
(4, 'CS', 3, ''),
(5, 'IS', 4, ''),
(6, 'Physical', 3, '');

-- --------------------------------------------------------

--
-- Table structure for table `lecturerdetails`
--

CREATE TABLE IF NOT EXISTS `lecturerdetails` (
  `regid` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `age` int(10) NOT NULL,
  `faculty` varchar(100) NOT NULL,
  PRIMARY KEY (`regid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `lecturerdetails`
--

INSERT INTO `lecturerdetails` (`regid`, `name`, `address`, `age`, `faculty`) VALUES
(6, 'Kasun de Zoysa', 'ambalangoda', 37, 'UCSC');

-- --------------------------------------------------------

--
-- Table structure for table `studentdetails`
--

CREATE TABLE IF NOT EXISTS `studentdetails` (
  `regid` int(12) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `age` int(10) NOT NULL,
  `address` varchar(100) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `faculty` varchar(30) NOT NULL,
  `yearofreg` varchar(10) NOT NULL,
  PRIMARY KEY (`regid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `studentdetails`
--

INSERT INTO `studentdetails` (`regid`, `firstname`, `lastname`, `age`, `address`, `gender`, `faculty`, `yearofreg`) VALUES
(1, 'nethmi', 'lakrandi', 22, 'meetiyagoda', 'Female', 'Science', '2016'),
(4, 'yasitha', 'nimantha', 22, 'amba', 'Male', 'Science', '2016'),
(5, 'Dasun', 'Harshan', 22, 'ambalangoda', 'Male', 'Science', '2017');
