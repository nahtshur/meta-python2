DESCRIPTION = "Font Awesome icons packaged for setuptools (easy_install) / pip."
HOMEPAGE = "https://pypi.python.org/pypi/XStatic-Font-Awesome"
SECTION = "devel/python"
LICENSE = "Apache-2"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=313d021898694cd2b0ea6508bdfe51a2"

PYPI_PACKAGE = "XStatic-Font-Awesome"

inherit pypi

SRC_URI[md5sum] = "141a0e9a7e21e82f922573a00ae0c166"
SRC_URI[sha256sum] = "e01fb480caaa7c7963dcb3328a4700e631bef6070db0e8b685816d220e685f6c"

DEPENDS += " \
        ${PYTHON_PN}-xstatic \
        ${PYTHON_PN}-pip \
        "

inherit pypi setuptools

SKIP_RECIPE[python-xstatic-font-awesome] ?= "${@bb.utils.contains('I_SWEAR_TO_MIGRATE_TO_PYTHON3', 'yes', '', 'python2 is out of support for long time, read https://www.python.org/doc/sunset-python-2/ https://python3statement.org/ and if you really have to temporarily use this, then set I_SWEAR_TO_MIGRATE_TO_PYTHON3 to "yes"', d)}"
