SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

CREATE TABLE IF NOT EXISTS `datamahasiswa` (
	`nim` varchar(10) NOT NULL,
	`nama` varchar(30) NOT NULL,
	`telepon` varchar(50) NOT NULL,
	`jurusan` varchar(30) NOT NULL,
	`TTL` varchar(100) NOT NULL,
	`jenis_kelamin` varchar(20) NOT NULL,
	`alamat` varchar(500) NOT NULL,
	`agama` varchar(20) NOT NULL,
	PRIMARY KEY(`nim`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `datamahasiswa` (`nim`,`nama`,`telepon`,`jurusan`,`TTL`,`jenis_kelamin`,`alamat`,`agama`) VALUES ('1810400596','Muhammad Fadil Ardiansyah','Teknik Informatika','25-05-97','Laki-Laki','Medang Tangerang','Islam');