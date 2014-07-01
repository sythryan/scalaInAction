package com.scalainaction.mongo

import com.mongodb.casbah.MongoDB

class DB private(val underlying: MongoDB) {
}

object DB {
	def apply(underlying: MongoDB) = new DB(underlying)
}
