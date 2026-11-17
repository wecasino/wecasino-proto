.PHONY: proto

proto:
	buf generate && buf generate --template buf.gen.tag.yaml
