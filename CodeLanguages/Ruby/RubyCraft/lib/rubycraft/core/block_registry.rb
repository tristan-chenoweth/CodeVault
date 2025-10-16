module RubyCraft
  module World
    class BlockRegistry
      def initialize
        @blocks_by_id = {}
        @blocks_by_name = {}
      end

      # Register a new block
      def register(block)
        raise "Duplicate block id #{block.id}" if @blocks_by_id.key?(block.id)
        raise "Duplicate block name #{block.name}" if @blocks_by_name.key?(block.name.downcase)

        @blocks_by_id[block.id] = block
        @blocks_by_name[block.name.downcase] = block
      end

      # Retrieve block by id
      def get_by_id(id)
        @blocks_by_id[id]
      end

      # Retrieve block by name
      def get_by_name(name)
        @blocks_by_name[name.downcase]
      end

      # List all registered blocks
      def all_blocks
        @blocks_by_id.values
      end
    end
  end
end
